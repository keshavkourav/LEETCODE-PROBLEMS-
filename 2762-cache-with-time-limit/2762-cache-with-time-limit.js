var TimeLimitedCache = function() {
    this.cache = new Map(); // store key -> { value, expiryTime }
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const exists = this.cache.has(key) && this.cache.get(key).expiry > now;

    // overwrite or set new key
    this.cache.set(key, { value, expiry: now + duration });

    return exists;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();

    if (!this.cache.has(key)) return -1;

    const { value, expiry } = this.cache.get(key);
    if (expiry <= now) {
        this.cache.delete(key);
        return -1;
    }

    return value;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let count = 0;

    for (const [key, { expiry }] of this.cache.entries()) {
        if (expiry > now) count++;
        else this.cache.delete(key); // cleanup expired entries
    }

    return count;
};

/**
 * Example Usage:
 * const timeLimitedCache = new TimeLimitedCache();
 * console.log(timeLimitedCache.set(1, 42, 100)); // false
 * console.log(timeLimitedCache.get(1)); // 42
 * console.log(timeLimitedCache.count()); // 1
 * // after 100ms -> expired
 * setTimeout(() => console.log(timeLimitedCache.get(1)), 150); // -1
 */
