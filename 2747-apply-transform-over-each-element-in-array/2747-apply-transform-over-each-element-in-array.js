/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    // Step 1: create an empty array to store the result
    var result = [];

    // Step 2: loop through each element using a basic for loop
    for (var i = 0; i < arr.length; i++) {

        // Step 3: apply the function to current element and index
        var transformedValue = fn(arr[i], i);

        // Step 4: store the new value in the result array
        result.push(transformedValue);
    }

    // Step 5: return the new transformed array
    return result;
};
