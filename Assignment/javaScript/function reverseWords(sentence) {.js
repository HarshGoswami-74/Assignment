function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Reverse each word in the array
    for (let i = 0; i < words.length; i++) {
        words[i] = reverseString(words[i]);
    }

    // Join the reversed words back into a sentence
    let reversedSentence = words.join(' ');

    return reversedSentence;
}

function reverseString(str) {
    // Convert the string to an array of characters, reverse it, and join it back into a string
    return str.split('').reverse().join('');
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedResult);
