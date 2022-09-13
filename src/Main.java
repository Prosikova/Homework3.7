public class Main {
    public static void main(String[] args) {
int weightLoseSportsmanKg = 7;
int weightLoseEveryDayGr1 = 250;
int weightLoseEveryDayGr2 = 500;
int grPerKg = 1000;
float weightLoseEveryDayKG1 = weightLoseEveryDayGr1 / (float)grPerKg;
System.out.println("Ежедневная потеря в весе спартсмена в первом случае равна " + weightLoseEveryDayKG1 + " кг");
float weightLoseEveryDayKG2 = weightLoseEveryDayGr2 / (float)grPerKg;
System.out.println("Ежедневная потеря в весе спартсмена во втором случае равна " + weightLoseEveryDayKG2 + " кг");
float dayLoseSportsman1 = weightLoseSportsmanKg /  weightLoseEveryDayKG1;
System.out.println("Спортсмену при сбросе ежедневно " +  weightLoseEveryDayKG1 + " кг потребуется " +  dayLoseSportsman1 + " дней");
float dayLoseSportsman2 = weightLoseSportsmanKg /  weightLoseEveryDayKG2;
System.out.println("Спортсмену при сбросе ежедневно " +  weightLoseEveryDayKG2 + " кг потребуется " +  dayLoseSportsman2 + " дней");
float daysAverage = (dayLoseSportsman1 + dayLoseSportsman2) / 2;
System.out.println("Спортсмен в среднем затратит " +  daysAverage + " день на сброс нужных ему 7 кг");
    }
}