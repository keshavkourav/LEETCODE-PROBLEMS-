/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    const val1 = await promise1;  // wait for first promise
    const val2 = await promise2;  // wait for second promise
    return val1 + val2;           // return their sum
};

/**
 * Example:
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
