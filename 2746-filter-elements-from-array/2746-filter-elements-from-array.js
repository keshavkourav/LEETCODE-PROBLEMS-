/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    // Step 1: Create an empty array to store filtered values
    var result = [];

    // Step 2: Loop through each element
    for (var i = 0; i < arr.length; i++) {

        // Step 3: Apply the filtering function
        if (fn(arr[i], i)) {
            // Step 4: If the result is truthy, push the element
            result.push(arr[i]);
        }
    }

    // Step 5: Return the final filtered array
    return result;
};
