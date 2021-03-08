public class ArmorStandPoses {

    private ArmorStand stand;

    public ArmorStandPoses(ArmorStand stand){
        this.stand = stand;
    }

    public void setItem(ItemStack is){
        stand.setItemInHand(is);
    }

    public void setSpasm(){
        Random rand = new Random();
        stand.setArms(true);
        stand.setBodyPose(new EulerAngle(rand.nextInt(360),rand.nextInt(360),rand.nextInt(360)));
        stand.setHeadPose(new EulerAngle(rand.nextInt(360),rand.nextInt(360),rand.nextInt(360)));
        stand.setLeftArmPose(new EulerAngle(rand.nextInt(360),rand.nextInt(360),rand.nextInt(360)));
        stand.setRightArmPose(new EulerAngle(rand.nextInt(360),rand.nextInt(360),rand.nextInt(360)));
    }
    public void setRightArmX(double x){
        stand.setRightArmPose(new EulerAngle(x,stand.getRightArmPose().getY(),stand.getRightArmPose().getZ()));
    }
    public void setRightArmY(double y){
        stand.setRightArmPose(new EulerAngle(stand.getRightArmPose().getX(),y,stand.getRightArmPose().getZ()));
    }
    public void setRightArmZ(double z){
        stand.setRightArmPose(new EulerAngle(stand.getRightArmPose().getX(),stand.getRightArmPose().getY(), z));
    }

    public void setLeftArmX(double x){
        stand.setLeftArmPose(new EulerAngle(x,stand.getRightArmPose().getY(),stand.getRightArmPose().getZ()));
    }
    public void setLeftArmY(double y){
        stand.setLeftArmPose(new EulerAngle(stand.getRightArmPose().getX(),y,stand.getRightArmPose().getZ()));
    }
    public void setLeftArmZ(double z){
        stand.setLeftArmPose(new EulerAngle(stand.getRightArmPose().getX(),stand.getRightArmPose().getY(), z));
    }

    public void setRightLegX(double x){
        stand.setRightLegPose(new EulerAngle(x,stand.getRightLegPose().getY(),stand.getRightLegPose().getZ()));
    }
    public void setRightLegY(double y){
        stand.setRightLegPose(new EulerAngle(stand.getRightLegPose().getX(),y,stand.getRightLegPose().getZ()));
    }
    public void setRightLegZ(double z){
        stand.setRightLegPose(new EulerAngle(stand.getRightLegPose().getX(),stand.getRightLegPose().getY(), z));
    }

    public void setLeftLegX(double x){
        stand.setLeftLegPose(new EulerAngle(x,stand.getRightLegPose().getY(),stand.getRightLegPose().getZ()));
    }
    public void setLeftLegY(double y){
        stand.setLeftLegPose(new EulerAngle(stand.getRightLegPose().getX(),y,stand.getRightLegPose().getZ()));
    }
    public void setLeftLegZ(double z){
        stand.setLeftLegPose(new EulerAngle(stand.getRightLegPose().getX(),stand.getRightLegPose().getY(), z));
    }

    public void setHeadX(double x){
        stand.setHeadPose(new EulerAngle(x,stand.getHeadPose().getY(),stand.getHeadPose().getZ()));
    }
    public void setHeadY(double y){
        stand.setHeadPose(new EulerAngle(stand.getHeadPose().getX(),y,stand.getHeadPose().getZ()));
    }
    public void setHeadZ(double z){
        stand.setHeadPose(new EulerAngle(stand.getHeadPose().getX(),stand.getHeadPose().getY(), z));
    }

    public void setBodyX(double x){
        stand.setBodyPose(new EulerAngle(x,stand.getBodyPose().getY(),stand.getBodyPose().getZ()));
    }
    public void setBodyY(double y){
        stand.setBodyPose(new EulerAngle(stand.getBodyPose().getX(),y,stand.getBodyPose().getZ()));
    }
    public void setBodyZ(double z){
        stand.setBodyPose(new EulerAngle(stand.getBodyPose().getX(),stand.getBodyPose().getY(), z));
    }


}
