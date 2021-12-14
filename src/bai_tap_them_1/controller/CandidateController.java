package bai_tap_them_1.controller;

import bai_tap_them_1.service.ICandidateService;
import bai_tap_them_1.service.impl.CandidateService;

import java.util.Scanner;

public class CandidateController {
    public static void main(String[] args) {
        ICandidateService iCandidateService = new CandidateService();
        Scanner scanner = new Scanner(System.in) ;
        do {
            System.out.println("1. Add new 1 Candidate");
            System.out.println("2. List all Candidate");
            System.out.println("3. Add n Candidate");
            System.out.println("4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    iCandidateService.addNewCandidate();
                    break;
                case 2 :
                    iCandidateService.getAll();
                    break;
                case 3 :
                    iCandidateService.addMoreCandidate() ;
                case 4 :
                    System.exit(0);
                    break;
            }
        } while (true) ;
    }

}
