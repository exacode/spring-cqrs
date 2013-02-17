package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmopOprFamIndex is a Querydsl query type for QPgAmopOprFamIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmopOprFamIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmopOprFamIndex> {

    private static final long serialVersionUID = -297215831;

    public static final QPgAmopOprFamIndex pgAmopOprFamIndex = new QPgAmopOprFamIndex("pg_amop_opr_fam_index");

    public final NumberPath<Long> amopfamily = createNumber("amopfamily", Long.class);

    public final NumberPath<Long> amopopr = createNumber("amopopr", Long.class);

    public final StringPath amoppurpose = createString("amoppurpose");

    public QPgAmopOprFamIndex(String variable) {
        super(QPgAmopOprFamIndex.class, forVariable(variable), "pg_catalog", "pg_amop_opr_fam_index");
    }

    @SuppressWarnings("all")
    public QPgAmopOprFamIndex(Path<? extends QPgAmopOprFamIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_amop_opr_fam_index");
    }

    public QPgAmopOprFamIndex(PathMetadata<?> metadata) {
        super(QPgAmopOprFamIndex.class, metadata, "pg_catalog", "pg_amop_opr_fam_index");
    }

}

