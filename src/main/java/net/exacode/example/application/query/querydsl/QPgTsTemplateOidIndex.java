package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsTemplateOidIndex is a Querydsl query type for QPgTsTemplateOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsTemplateOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsTemplateOidIndex> {

    private static final long serialVersionUID = 632345340;

    public static final QPgTsTemplateOidIndex pgTsTemplateOidIndex = new QPgTsTemplateOidIndex("pg_ts_template_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTsTemplateOidIndex(String variable) {
        super(QPgTsTemplateOidIndex.class, forVariable(variable), "pg_catalog", "pg_ts_template_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTsTemplateOidIndex(Path<? extends QPgTsTemplateOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_template_oid_index");
    }

    public QPgTsTemplateOidIndex(PathMetadata<?> metadata) {
        super(QPgTsTemplateOidIndex.class, metadata, "pg_catalog", "pg_ts_template_oid_index");
    }

}

