package test;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseRunner;
import fitnesse.junit.FitNesseRunner.FitnesseDir;
import fitnesse.junit.FitNesseRunner.OutputDir;
import fitnesse.junit.FitNesseRunner.Suite;

@RunWith(FitNesseRunner.class)
@FitnesseDir(value=".")
@OutputDir(value="~/Downloads/temp")
@Suite("MyHome.TestSuit1.FirstTest")

public class TestFit {
	public void run(){
		
	}
}
