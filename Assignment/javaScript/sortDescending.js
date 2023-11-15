function sortDescending(arr) {
    let len = arr.length;

    for (let i = 0; i < len - 1; i++) {
        for (let j = 0; j < len - 1 - i; j++) {
            // Compare adjacent elements and swap them if they are in the wrong order
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    return arr;
}

// Example usage
let unsortedArray = [5, 2, 9, 1, 5, 6];
let sortedArray = sortDescending(unsortedArray);

console.log("Unsorted Array: " + unsortedArray.join(', '));
console.log("Sorted Array (Descending): " + sortedArray.join(', '));
