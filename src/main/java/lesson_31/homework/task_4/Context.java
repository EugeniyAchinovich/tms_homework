package lesson_31.homework.task_4;

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeOperation() {
        strategy.executeStrategy();
    }
}
