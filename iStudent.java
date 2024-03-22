package PrototypeAndRegistry;

public class iStudent extends Student {
    int psp;

    public iStudent(){
    }

    public iStudent(iStudent is){
        super(is);
        this.psp = is.psp;
    }

    public iStudent copy(){
        iStudent is1 = new iStudent(this);
        return is1;
    }

}
