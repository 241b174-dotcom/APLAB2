class Mother{
    Child[] child = new Child[5];
    void show(){
        for(int i = 0; i<child.length; i++ ){
            System.out.println(child[i].getName());
        }
    }
    
}
    