public final class Random {

    public static int randint(final int min, int max) {

        int answer = 0;

        if (min < max && min == 0 || min == 1) {

            answer = (int) Math.round(Math.random() * max);

        } else if (min < max) {

            max -= min;

            answer = (int) (Math.random() * ++max) + min;

        }

        if (answer == 0) { randint(min, max); }

        return answer;

    }


    public static double randouble(final double min, double max) {

        double answer = 0;

        if (min < max && min == 0 || min == 1) {

            answer = (double) Math.round(Math.random() * max);

        } else if (min < max) {

            max -= min;

            answer = (Math.random() * ++max) + min;

        }

        if (answer == 0) { randouble(min, max); }

        return answer;

    }

}
