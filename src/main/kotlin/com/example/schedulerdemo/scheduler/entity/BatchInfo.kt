package com.example.schedulerdemo.scheduler.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Id

data class BatchInfo(
    @Column(name="BAT_PGM_ID")
    @Id
    val batchProgramId: String,

    @Column(name="BAT_PGM_NM")
    val batchProgramName: String,

    @Column(name="BAT_EXEC_DV_CD")
    val batchExecDivisionCode: String,

    @Column(name="BAT_EXEC_PRD_VAL")
    val batchExecPeriodValue: String?,

    @Column(name="FILE_INPT_YN")
    val fileInputYn: String?,

    @Column(name="PRE_BAT_ID")
    val preworkBatchId: String?,

    @Column(name="UZ_YN")
    val useYn: String,

    @Column(name="FILE_ID")
    val fileId: String?,

    @Column(name="EXEC_PARAM_CTNT")
    val execParametersContent: String?,

    @Column(name="FRST_REG_TMST")
    val firstRegisteredTimestamp: Date,

    @Column(name="FRST_REG_EMPNO")
    val firstRegisteredEmployeeNumber: String,

    @Column(name="FRST_REG_BRCD")
    val firstRegisteredBranchCode: String,

    @Column(name="LAST_CHNG_TMST")
    val lastChangedTimestamp: Date,

    @Column(name="LAST_CHNG_EMPNO")
    val lastChangedEmployeeNumber: String,

    @Column(name="LAST_CHNG_BRCD")
    val lastChangedBranchCode: String,


    )
