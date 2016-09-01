var me = {};

me.askMe = function(){
console.log(this.name + " is calling age " + this.age);
};

me.name = "Marcin";
me.age = 45;

me.askMe();
