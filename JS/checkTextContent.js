/*jshint multistr:true */
text = " Mar asd  98as mlakd 9 2-3e ;as KAsi Kuba Szymon asd  09asd sakd l;aksd  ASD ::";

var myName = "Marcin";
var hits = [];

//look for M in the text
for (var i=0; i < text.length;i++) {
  if (text[i] === 'M') {
    for (var j = i; j < (myName.length +1); j++) {
      hits.push(text[j]);
    }
  }
}

if
