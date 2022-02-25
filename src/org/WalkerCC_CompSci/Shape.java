package org.WalkerCC_CompSci;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double CalculateSideLength(Point point0, Point point1){
        //Does the GetSideLength math work stuff

        double x0 = point0.getX();
        double y0 = point0.getY();
        double x1 = point1.getX();
        double y1 = point1.getY();
        double xDist = x0 - x1;
        double yDist = y0 - y1;
        double xTotal = Math.pow(xDist, 2);
        double yTotal = Math.pow(yDist, 2);
        double yAndX = xTotal + yTotal;
        return Math.sqrt(yAndX);



    }

    public double GetPerimeter(){
        //Does the Perimeter Math Work Stuff
        double total = 0;
        for (int i = 0; i < listOfPoints.length; i++) {

            total = 0;
            total = total + GetSideLength(i);
            total = total + GetSideLength(i);
            total = total + GetSideLength(i);
            total = total + GetSideLength(i);


        }

        return total;
    }



}
