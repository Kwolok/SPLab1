public class ImageProxi implements  Element{
    String imgname;
    Image realimage;

    @Override
    public void print() {
        if(realimage == null){
            realimage = new Image(imgname);
        }
        else{
            realimage.render();
        }
    }
    public ImageProxi(){
        this.imgname = imgname;
        this.realimage = null;
    }
}
