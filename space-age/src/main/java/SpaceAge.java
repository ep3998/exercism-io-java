class SpaceAge {
	private double seconds;
	private final double EARTH_SEC = 31557600;
	private final double MERCURY_YEAR = 0.2408467;
	private final double VENUS_YEAR = 0.61519726;
	private final double MARS_YEAR = 1.8808158;
	private final double JUPITER_YEAR = 11.862615;
	private final double SATURN_YEAR = 29.447498;
	private final double URANUS_YEAR = 84.016846;
	private final double NEPTUNE_YEAR = 164.79132;
	
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
    	return this.seconds;
    }

    double onEarth() {
    	return this.seconds / this.EARTH_SEC;
    }

    double onMercury() {
    	return (this.seconds / this.EARTH_SEC) / this.MERCURY_YEAR;
    }

    double onVenus() {
    	return (this.seconds / this.EARTH_SEC) / this.VENUS_YEAR;
    }

    double onMars() {
    	return (this.seconds / this.EARTH_SEC) / this.MARS_YEAR;
    }

    double onJupiter() {
    	return (this.seconds / this.EARTH_SEC) / this.JUPITER_YEAR;
    }

    double onSaturn() {
    	return (this.seconds / this.EARTH_SEC) / this.SATURN_YEAR;
    }

    double onUranus() {
    	return (this.seconds / this.EARTH_SEC) / this.URANUS_YEAR;
    }

    double onNeptune() {
    	return (this.seconds / this.EARTH_SEC) / this.NEPTUNE_YEAR;
    }

}
