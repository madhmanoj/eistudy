package exercise2;

interface Direction {
    void moveForward(Position position);

    void turnLeft(Position position);

    void turnRight(Position position);
}

class North implements Direction {
    @Override
    public void moveForward(Position position) {
        position.y += 1;
    }

    @Override
    public void turnLeft(Position position) {
        position.direction = new West();
    }

    @Override
    public void turnRight(Position position) {
        position.direction = new East();
    }

    @Override
    public String toString() {
        return "North";
    }
}

class South implements Direction {
    @Override
    public void moveForward(Position position) {
        position.y -= 1;
    }

    @Override
    public void turnLeft(Position position) {
        position.direction = new East();
    }

    @Override
    public void turnRight(Position position) {
        position.direction = new West();
    }

    @Override
    public String toString() {
        return "South";
    }
}

class East implements Direction {
    @Override
    public void moveForward(Position position) {
        position.x += 1;
    }

    @Override
    public void turnLeft(Position position) {
        position.direction = new North();
    }

    @Override
    public void turnRight(Position position) {
        position.direction = new South();
    }

    @Override
    public String toString() {
        return "East";
    }
}

class West implements Direction {
    @Override
    public void moveForward(Position position) {
        position.x -= 1;
    }

    @Override
    public void turnLeft(Position position) {
        position.direction = new South();
    }

    @Override
    public void turnRight(Position position) {
        position.direction = new North();
    }

    @Override
    public String toString() {
        return "West";
    }
}
