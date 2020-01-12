console.log('Welcome to TS');

let a=100;
a=null;

console.log(a);

//a='abc'; error cannot reassign type number to string

let b;//implicitly considered as any type 

b=100;
b='abc';
console.log(b);

let marks : number[] =[1,3,5,4,3];//only stores numbers

console.log(marks);

let student :{name: string, age: number, pass: boolean};

student ={
    name: 'mammu',
    age:20,
    pass: true
}

console.log(student);

class Sample{
    x=10;
    y='nani';
}
let sample1=new Sample();
console.log(sample1.x);
console.log(sample1.y);

class StudentDetails{
    // name:string;
    // age: number;
    // marks: number;
    constructor( 
       public name:string ,
       public age: number, 
       public marks: number){
        // this.name=name;
        // this.age=age;
        // this.marks=marks;
    }
    printDetails(): void {
        console.log(`
        Name is ${this.name},
        age is ${this .age},
        marks are ${this.marks}
        `);

    }
}

let s1=new StudentDetails('kavi',20,88);
s1.printDetails();
console.log("name is",s1.name);








