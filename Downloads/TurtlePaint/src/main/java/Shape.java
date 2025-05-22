abstract class Shape implements IDrawable {
    protected   Turtle turtle;
    protected  int xPostion;
    protected  int yPostion;
    protected  String colorName;
    protected  int borderWidth;


public  void draw(){

}
public Shape(Turtle turtle,int xPostion ,int yPostion,String colorName, int borderWidth){
    this.turtle=turtle;
    this.xPostion=xPostion;
    this.yPostion=yPostion;
    this.colorName=colorName;
    this.borderWidth=borderWidth;
}
}

