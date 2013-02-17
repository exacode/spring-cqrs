package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpfamilyAmNameNspIndex is a Querydsl query type for QPgOpfamilyAmNameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpfamilyAmNameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgOpfamilyAmNameNspIndex> {

    private static final long serialVersionUID = -1326372034;

    public static final QPgOpfamilyAmNameNspIndex pgOpfamilyAmNameNspIndex = new QPgOpfamilyAmNameNspIndex("pg_opfamily_am_name_nsp_index");

    public final NumberPath<Long> opfmethod = createNumber("opfmethod", Long.class);

    public final SimplePath<Object> opfname = createSimple("opfname", Object.class);

    public final NumberPath<Long> opfnamespace = createNumber("opfnamespace", Long.class);

    public QPgOpfamilyAmNameNspIndex(String variable) {
        super(QPgOpfamilyAmNameNspIndex.class, forVariable(variable), "pg_catalog", "pg_opfamily_am_name_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgOpfamilyAmNameNspIndex(Path<? extends QPgOpfamilyAmNameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opfamily_am_name_nsp_index");
    }

    public QPgOpfamilyAmNameNspIndex(PathMetadata<?> metadata) {
        super(QPgOpfamilyAmNameNspIndex.class, metadata, "pg_catalog", "pg_opfamily_am_name_nsp_index");
    }

}

