package Lab1.Task1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
       this.width = width;
       this.height = height;
       this.ppi = ppi;
       this.model = model;
   }

    public void compareSize(Display m){
        int thisArea = this.width*this.height;
        int mArea = m.width*m.height;
        if(thisArea < mArea){
            System.out.println("    The size of the " + m.model + " is bigger than the size of the " + this.model + " display");
        }else if(thisArea > mArea){
            System.out.println("    The size of the " + this.model + " is bigger than the size of the " + m.model + " display");
        }else{
            System.out.println("    The size of the " + this.model + " and "+ m.model + " displays is equal");
        }
    }

    public void compareSharpness(Display m){
        if(this.ppi < m.ppi){
            System.out.println("    The sharpness of the " + m.model + " is bigger than the sharpness of the " + this.model + " display");
        }else if(this.ppi > m.ppi){
            System.out.println("    The sharpness of the " + this.model + " is bigger than the sharpness of the " + m.model + " display");
        }else{
            System.out.println("    The sharpness of the " + this.model + " and "+ m.model + " displays is equal");
        }
    }
    public void compareWithMonitor(Display m){
        System.out.println("\n# Comparing monitors " + m.model + " and " + this.model);
        System.out.println("\n By size:\n");
        compareSize(m);
        System.out.println("\n By sharpness:\n");
        compareSharpness(m);
    }

    public int getWidth() {
       return width;
    }
    public void setWidth(int width) {
       this.width = width;
    }

    public int getHeight() {
       return height;
    }
    public void setHeight(int height) {
       this.height = height;
    }

    public float getPpi() {
       return ppi;
    }
    public void setPpi(float ppi) {
       this.ppi = ppi;
    }

    public String getModel() {
       return model;
    }
    public void setModel(String model) {
       this.model = model;
    }

}
