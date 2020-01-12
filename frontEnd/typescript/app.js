"use strict";
console.log('Welcome to TS');
var a = 100;
a = null;
console.log(a);
//a='abc'; error cannot reassign type number to string
var b; //implicitly considered as any type 
b = 100;
b = 'abc';
console.log(b);
var marks = [1, 3, 5, 4, 3]; //only stores numbers
console.log(marks);
var student;
student = {
    name: 'mammu',
    age: 20,
    pass: true
};
console.log(student);
var Sample = /** @class */ (function () {
    function Sample() {
        this.x = 10;
        this.y = 'nani';
    }
    return Sample;
}());
var sample1 = new Sample();
console.log(sample1.x);
console.log(sample1.y);
var StudentDetails = /** @class */ (function () {
    // name:string;
    // age: number;
    // marks: number;
    function StudentDetails(name, age, marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        // this.name=name;
        // this.age=age;
        // this.marks=marks;
    }
    return StudentDetails;
}());
var s1 = new StudentDetails('kavi', 20, 88);
console.log("name is", s1.name);
console.log(StudentDetails);
