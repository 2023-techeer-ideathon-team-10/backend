package org.techeer.backend.service.report;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techeer.backend.domain.report.Report;
import org.techeer.backend.domain.report.ReportRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    private final ReportRepository reportRepository;

    @Autowired
    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    public Optional<Report> getReportById(Long id) {
        return reportRepository.findById(id);
    }

    public Report createReport(Report report) {
        report.setReportTime(LocalDateTime.now());
        return reportRepository.save(report);
    }

    public Optional<Report> updateReport(Long id, Report updatedReport) {
        return reportRepository.findById(id).map(report -> {
            report.setSeatId(updatedReport.getSeatId());
            report.setNum(updatedReport.getNum());
            report.setReportContent(updatedReport.getReportContent());
            return reportRepository.save(report);
        });
    }

    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }
}