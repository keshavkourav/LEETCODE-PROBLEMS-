/**
 * @param {number} init
 * @return {Object}
 */
var createCounter = function(init) {
    let i = init;

    return {
        increment: () => ++i,
        decrement: () => --i,
        reset: () => (i = init)
    };
};

