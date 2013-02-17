package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmprocFamProcIndex is a Querydsl query type for QPgAmprocFamProcIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmprocFamProcIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmprocFamProcIndex> {

    private static final long serialVersionUID = 25865575;

    public static final QPgAmprocFamProcIndex pgAmprocFamProcIndex = new QPgAmprocFamProcIndex("pg_amproc_fam_proc_index");

    public final NumberPath<Long> amprocfamily = createNumber("amprocfamily", Long.class);

    public final NumberPath<Long> amproclefttype = createNumber("amproclefttype", Long.class);

    public final NumberPath<Short> amprocnum = createNumber("amprocnum", Short.class);

    public final NumberPath<Long> amprocrighttype = createNumber("amprocrighttype", Long.class);

    public QPgAmprocFamProcIndex(String variable) {
        super(QPgAmprocFamProcIndex.class, forVariable(variable), "pg_catalog", "pg_amproc_fam_proc_index");
    }

    @SuppressWarnings("all")
    public QPgAmprocFamProcIndex(Path<? extends QPgAmprocFamProcIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amproc_fam_proc_index");
    }

    public QPgAmprocFamProcIndex(PathMetadata<?> metadata) {
        super(QPgAmprocFamProcIndex.class, metadata, "pg_catalog", "pg_amproc_fam_proc_index");
    }

}

