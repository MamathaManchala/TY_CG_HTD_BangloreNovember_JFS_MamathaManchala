

class Student{
   
    constructor( 
       public name:string ,
       public age: number, 
       public marks: number,
       public genger?: string,
       public adhar?: number
       ){

       }
       static data(){
           console.log('method in student class');
       }
    }

    let student1: Student ={
        name: 'jyothi',
        age:19,
        marks: 98,
      

    }

    let student2=new Student('hema',40,80,undefined,345678);

    let clearedStudents =[

        new Student('mamatha',20,90),
        new Student('Appu',20,89),
    ];
    console.log(clearedStudents);
