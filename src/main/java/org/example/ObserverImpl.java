package org.example;

public class ObserverImpl implements Observer{
    private int counter;
    @Override
    public void update(int state) {
        //int state = ((ObservableImpl)observable).getState();
        if(state%2==0) ++counter;
        double res = state*state+9;
        System.out.println("**** Observable Impl2 ****");
        System.out.println("Nouvelle mise à jour : state = "+state);
        System.out.println("Résultat de calcul : " + ((state%2)==0? "Pair":"impair"));
        System.out.println("Le compteur est : " + counter);
        System.out.println("**************");
    }
}
