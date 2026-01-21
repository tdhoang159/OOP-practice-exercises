/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.truongduchoang.bai03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Truong Duc Hoang
 */
public class QLTiemChung {

    private List<NguoiDan> dsNguoiDan = new ArrayList<>();
    private List<Vaccine> dsVaccine = new ArrayList<>();

    public void themNguoiDan(NguoiDan... a) {
        this.dsNguoiDan.addAll(Arrays.asList(a));
    }

    public void themVaccine(Vaccine... a) {
        this.dsVaccine.addAll(Arrays.asList(a));
    }

    public void hienThiVaccine() {
        this.dsVaccine.forEach(v -> v.hienThi());
    }

    public void hienThiNguoiNuocNgoai() {
        this.dsNguoiDan.stream().filter(p -> p instanceof NguoiNuocNgoai).collect(Collectors.toList()).forEach(nd -> nd.hienThi());
    }

    public void nhapVaGhiNhanTiemChung(String cccd) {
        NguoiDan ngDan = this.dsNguoiDan.stream()
                .filter(p -> p.getCCCD().equalsIgnoreCase(cccd))
                .findFirst()
                .orElse(null);

        if (ngDan == null) {
            System.out.printf("Khong tim thay nguoi dan co so cccd: %s", cccd);
            return;
        }
        
        if (!ngDan.isTren18Tuoi()) {
            System.out.println("Nguoi dan chua du 18 tuoi");
            return;
        }


        if (ngDan.getDsTiemChung().size() >= 3) {
            System.out.println("Nguoi dan da tiem du 3 mui");
            return;
        }

        if (!ngDan.getDsTiemChung().isEmpty()) {
            LocalDate ngayMuiGanNhat
                    = ngDan.getDsTiemChung().getLast().getNgayTiem();

            if (ngayMuiGanNhat.plusMonths(3).isAfter(LocalDate.now())) {
                System.out.println("Chua du 3 thang tu ngay tiem gan nhat!");
                return;
            }
        }

        // 5. Hiển thị danh sách vắc xin
        System.out.println("\nDanh sách vắc xin:");
        for (int i = 0; i < dsVaccine.size(); i++) {
            System.out.println((i + 1) + ". " + dsVaccine.get(i));
        }

        // 6. Chọn vắc xin
        System.out.print("Chọn vắc xin (số): ");
        int chon = CauHinh.SC.nextInt();
        CauHinh.SC.nextLine();

        if (chon < 1 || chon > dsVaccine.size()) {
            System.out.println("Lua chon khong hop le");
            return;
        }

        Vaccine vaccine = dsVaccine.get(chon - 1);

        // 7. Nhập ngày & nơi tiêm
        System.out.print("Nhập ngày tiêm (dd/MM/yyyy): ");
        LocalDate ngayTiem = LocalDate.parse(CauHinh.SC.nextLine(), CauHinh.FORMMAT_DATE);

        System.out.print("Nhập nơi tiêm: ");
        String noiTiem = CauHinh.SC.nextLine();

        // 8. Ghi nhận mũi tiêm
        ThongTinTiemChung tt
                = new ThongTinTiemChung(vaccine, ngayTiem, noiTiem);

        ngDan.getDsTiemChung().add(tt);

        System.out.println("✅ Ghi nhận tiêm chủng thành công!");
    }
}
