class Associate{
    associateId:any;
    firstName:string;
    lastName:string;
    basicSalary:number;
    hra:number;
    ta:number;
    da:number;
    totalSalary:number;
    constructor(associateId:number,firstName:string,lastName:string,basicSalary:number){
        this.associateId=associateId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.basicSalary=basicSalary;
    }
    calculateTotalSalary():void{
        this.hra=this.basicSalary*10/100;
        this.ta=this.basicSalary*7/100;
        this.da=this.basicSalary*6/100;
        this.totalSalary=this.basicSalary+this.hra+this.da+this.ta;
    }
    toString():string{
        return this.associateId+" "+this.firstName+" "+this.lastName+" "+this.basicSalary;
    }
}
var associateList = new Array<Associate>(3);
associateList[0]= new Associate(101,"Sundar","Bishnoi",15000);
associateList[1]= new Associate(102,"Lal","Bishnoi",20000);
associateList[2]= new Associate(103,"Suresh","Bishnoi",25000);
    associateList.forEach(associate=>{
    associate.calculateTotalSalary();
    console.log(associate.toString());
    })

