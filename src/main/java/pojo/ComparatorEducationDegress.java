package main.java.pojo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import static main.java.pojo.GroupApplicants.NAME_DEGREES;


public class ComparatorEducationDegress implements Comparator<Applicant> {
    @Override
    public int compare(Applicant ap1, Applicant ap2) {
        int ap1DegreeRang = Arrays.asList(NAME_DEGREES).indexOf(ap1.getEducationDegree());
        int ap2DegreeRang = Arrays.asList(NAME_DEGREES).indexOf(ap2.getEducationDegree());

        if (!ap1.getEducationDegree().equals(ap2.getEducationDegree())) {
            return ap1DegreeRang - ap2DegreeRang;
        }
        return ap1.getSalary() - (ap2.getSalary());
    }

    @Override
    public Comparator<Applicant> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Applicant> thenComparing(Comparator<? super Applicant> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Applicant> thenComparing(Function<? super Applicant, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Applicant> thenComparing(Function<? super Applicant, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Applicant> thenComparingInt(ToIntFunction<? super Applicant> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Applicant> thenComparingLong(ToLongFunction<? super Applicant> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Applicant> thenComparingDouble(ToDoubleFunction<? super Applicant> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
