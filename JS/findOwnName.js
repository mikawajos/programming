/*jshint multistr:true */

var text = 'asd caw as ac sdas dasasda dq2da Adk8 Marcin jas o8ca7uiahs ayudi';
var myName = 'Marcin';
hits = [];

console.log('TEXT array is length: ', text.length);
console.log('First element of arrya is: ', text[0]);

for(var i=0; i < text.length; i++) {
    if(text[i] === myName[0]){
        for(var j = i; j < i + (myName.length); j++){
            hits.push(text[j]);
            }
    }
}

if(hits.length !== 0){
    console.log(hits);
    console.log("Your name was found!");
}
else{
console.log("Your name was NOT FOUND, length: ", hits.length);
}
