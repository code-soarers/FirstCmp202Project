public class Energy extends Physics {

    float potentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    float kineticEnergy(float mass, float velocity){
        return (1/2) * mass * (velocity * velocity);
    }
}
