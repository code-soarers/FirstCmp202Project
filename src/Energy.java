public class Energy extends Physics{

    float potentialEnergy(float mass, float height){
        return mass * getGravity() * height;
    }
}
