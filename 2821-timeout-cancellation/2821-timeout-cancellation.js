/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    // Start a timeout to execute fn after t milliseconds
    const timer = setTimeout(() => {
        fn(...args);
    }, t);

    // Return a cancel function that clears the timeout
    const cancelFn = function() {
        clearTimeout(timer);
    };

    return cancelFn;
};
