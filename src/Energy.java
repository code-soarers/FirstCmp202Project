public class Energy extends Physics {

    float potentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    float kineticEnergy(float mass, float velocity){
        return ((float) 1 /2) * mass * (velocity * velocity);
    }

    float heatEnergy(float mass, float initialTemperature, float finalTemperature){
        return mass * 4.2f * (finalTemperature - initialTemperature);
    }
    float workDone(float force, float distance){
        return force * distance;

    }
    double speedOfLight=3.0*(Math.pow(10,8));
    double nuclearEnergy(double mass){
        return mass*speedOfLight*speedOfLight;
    }
    float gravitationalEnergy(float mass, float gravitationalField, float height)
    {
        return mass * gravitationalField * height;
    }
}
