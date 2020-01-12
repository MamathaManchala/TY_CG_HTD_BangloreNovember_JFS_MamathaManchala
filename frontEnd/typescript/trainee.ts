
class Student2{
   
    constructor( 
      
       public marks: number,
       public genger?: string,
       public adhar?: number
       ){

       }
       static data(){
           console.log('method in student class');
       }
    }



interface Training extends Student2{
    name: string,
    age: number,

    data(): void
    printData(): void
}

class Trainee implements Training{
name='mamatha';
age=21;
marks=67;
gender='f';
adhar=2345;

data(){
    console.log('hi mammu');
}
printData(){
    console.log('hello mammu');
}

}

let training1:Training={
    name:'Raja',
    age:20,
    printData:function(){
        console.log(this.name,this.age);
    },
    marks:80,
    adhar:4567,

    data:function(){
        console.log('data function');
    }
}