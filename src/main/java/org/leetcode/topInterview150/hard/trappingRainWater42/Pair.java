package org.leetcode.topInterview150.hard.trappingRainWater42;

public class Pair {
    int startPool;
    int endPool;

    public Pair(int startPool, int endPool) {
        this.startPool = startPool;
        this.endPool = endPool;
    }

    public int getStartPool() {
        return this.startPool;
    }

    public int getEndPool() {
        return this.endPool;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Pair)) return false;
        final Pair other = (Pair) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getStartPool() != other.getStartPool()) return false;
        if (this.getEndPool() != other.getEndPool()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Pair;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getStartPool();
        result = result * PRIME + this.getEndPool();
        return result;
    }
}
