/**
 * @author 贲阳林
 */
public class Simple342 {
    public boolean isPowerOfFour(int num) {
       float flag=4;
       float temp=(float) num;
        if (num <= 0) {
            return false;
        }
        if(num==1){
            return true;
        }
        while(temp>flag){
            temp=(float)temp/flag;
        }
        return temp==4?true:false;
    }
}
