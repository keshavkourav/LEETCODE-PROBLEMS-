


/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    // Call the function immediately
    fn(...args);

    // Then keep calling it every t milliseconds
    const intervalId = setInterval(() => fn(...args), t);

    // Return cancel function to stop the interval
    const cancelFn = function() {
        clearInterval(intervalId);
    };

    return cancelFn;
};
