/*jshint multistr:true */

var text = 'add casd masdsd MarcinK TOmekD asd asd da 9898 asd as ';
var myName = 'Marcin';
hits = [];
console.log('TEXT array length is: ', text.length);
console.log('FIrst element of arrry is: ', text[0]);

for (var i=0; i < text.length; i++) {
  if(text[i] === myName[0]) {
    for(var j=0; j < i + (myName.length); j++){
      hits.push(text[j]);
    }
  }
}
console.log(hits);
