class PalindromeNumber{
    no:number;

    digits_count(b:number):number{
        var count = 0;
        if (b >= 1) ++count;
      
        while (b / 10 >= 1) {
          b /= 10;
          ++count;
        }
      
        return count;
      }
    checkNo(no1:number):boolean{
        var i=0,p=0,q=0;
        var newNo=no1;
        var r = this.digits_count(no1);
        for(i=0;i<r;i++){ 
            q=newNo%10;
            newNo/=10;
            p=q+p*10;
        }
        if(no1==p) return true
        if(no1!=p) return false
    }
}

var pn = new PalindromeNumber();
console.log(pn.checkNo(12421));