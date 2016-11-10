var losoweCzesciCiala=["Twarz","Noga","Glowa"];
var losowePrzymiotniki=["dziwne","twarda","Brudna","Glupia"];
var losoweSlowa=["Mucha","Kuna","Robak","Norka","Malpa"];

var zniewagacz = function(){

var losowaCzescCiala=losoweCzesciCiala[Math.floor(Math.random()*3)];

var losowyPrzymiotnik=losowePrzymiotniki[Math.floor(Math.random()*3)];

var losoweSlowo=losoweSlowa[Math.floor(Math.random()*5)];

var losowaZniewaga = "Twoja " + losowaCzescCiala + " jest jak " + losowyPrzymiotnik + " " + losoweSlowo + " !!!";
console.log(losowaZniewaga);
};

zniewagacz();
