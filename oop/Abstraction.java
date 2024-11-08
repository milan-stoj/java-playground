
class Abstraction {

    public static void main(String[] args) {
        House house = new House();
        HomeOwner owner = new HomeOwner(house);

        owner.controls.toggleWater();
        owner.controls.toggleLights();
        owner.controls.status();

        owner.controls.toggleWater();
        owner.controls.toggleLights();
        owner.controls.status();
    }
}

class HomeOwner {

    House house;
    HouseControls controls;

    HomeOwner(House house) {
        this.house = house;
        this.controls = new HouseControls(house);
    }
}

// facade / abstraction layer
class HouseControls {

    House house;

    HouseControls(House house) {
        this.house = house;
    }

    public void toggleWater() {
        this.house.plumbing.isWaterRunning = !this.house.plumbing.isWaterRunning;
    }

    public void toggleLights() {
        this.house.electrical.isLightsOn = !this.house.electrical.isLightsOn;
    }

    public void status() {
        System.out.println(String.format("Water: %s\nLights: %s", house.electrical.isLightsOn, house.plumbing.isWaterRunning));
    }
}

class House {

    Plumbing plumbing;
    Electrical electrical;

    House() {
        this.plumbing = new Plumbing();
        this.electrical = new Electrical();
    }
}

class Plumbing {

    boolean isWaterRunning;

    Plumbing() {
        isWaterRunning = false;
    }
}

class Electrical {

    boolean isLightsOn;

    Electrical() {
        isLightsOn = false;
    }
}
