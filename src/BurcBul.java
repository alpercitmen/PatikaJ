import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int bDay, bMonth;

            System.out.print("Doğruğunuz ayı girin:");
            bMonth = input.nextInt();

            System.out.print("Doğruğunuz günü girin:");
            bDay = input.nextInt();
            if (bMonth <= 12 && bMonth >= 1) {
                if (bMonth == 1) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 22) {
                            System.out.println("Oğlak Burcu");
                        } else {
                            System.out.println("Kova Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 2) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 20) {
                            System.out.println("Kova Burcu");
                        } else {
                            System.out.println("Balık Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 3) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 21) {
                            System.out.println("Balık Burcu");
                        } else {
                            System.out.println("Koç Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 4) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 21) {
                            System.out.println("Koç Burcu");
                        } else {
                            System.out.println("Boğa Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 5) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 22) {
                            System.out.println("Boğa Burcu");
                        } else {
                            System.out.println("İkizler Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 6) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 23) {
                            System.out.println("İkizler Burcu");
                        } else {
                            System.out.println("Yengeç Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 7) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 23) {
                            System.out.println("Yengeç Burcu");
                        } else {
                            System.out.println("Aslan Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 8) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 23) {
                            System.out.println("Aslan Burcu");
                        } else {
                            System.out.println("Başak Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 9) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 23) {
                            System.out.println("Başak Burcu");
                        } else {
                            System.out.println("Terazi Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 10) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 23) {
                            System.out.println("Terazi Burcu");
                        } else {
                            System.out.println("Akrep Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 11) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 22) {
                            System.out.println("Akrep Burcu");
                        } else {
                            System.out.println("Oğlak Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                } else if (bMonth == 12) {
                    if (bDay >= 1 && bDay <= 31) {
                        if (bDay < 22) {
                            System.out.println("Yay Burcu");
                        } else {
                            System.out.println("Oğlak Burcu");
                        }
                    } else {
                        System.out.println("Geçersiz bir gün girdiniz!");
                    }
                }
            } else {
                System.out.println("Geçersiz bir ay girdiniz!");
            }
        }
    }
}
