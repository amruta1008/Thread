package com.calculate;

public class CalculateScores implements Runnable {

	
	private String matchType;
	private String scoreString;
	private Integer[] scores;
	private double meanScore;
	private int minScore;
	private int maxScore;
	
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getScoreString() {
		return scoreString;
	}

	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}

	public Integer[] getScores() {
		return scores;
	}

	public void setScores(Integer[] scores) {
		this.scores = scores;
	}

	public double getMeanScore() {
		return meanScore;
	}

	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}

	public int getMinScore() {
		return minScore;
	}

	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	@Override
	public void run() {
		
		System.out.println("Match:" +getMatchType());
		String scores = getScoreString();
		String[] strarr = scores.split(",");
		Integer[] intarr = new Integer[strarr.length];
		for(int j = 0;j<strarr.length;j++)
		{
			intarr[j] = Integer.parseInt(strarr[j]); 
		}
			setScores(intarr);
			Integer[] score = getScores();
			int min = score[0],max=0;
			double mean=0,sum=0;
			for(int i=0;i<score.length;i++)
			{
				if(max<score[i])
					max = score[i];
				if(min>score[i])
					min = score[i];
				sum = sum+score[i];
			}
		 mean = sum/score.length;
		 setMeanScore(mean);
		 System.out.println("Mean Score: " +getMeanScore());
		 setMaxScore(max);
		 System.out.println("Max score: " +getMaxScore());
		 setMinScore(min);
		 System.out.println("min score: " +getMinScore());
		 
	}

}
