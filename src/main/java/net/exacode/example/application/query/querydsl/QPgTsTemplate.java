package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsTemplate is a Querydsl query type for QPgTsTemplate
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsTemplate extends com.mysema.query.sql.RelationalPathBase<QPgTsTemplate> {

    private static final long serialVersionUID = 228837812;

    public static final QPgTsTemplate pgTsTemplate = new QPgTsTemplate("pg_ts_template");

    public final SimplePath<Object> tmplinit = createSimple("tmplinit", Object.class);

    public final SimplePath<Object> tmpllexize = createSimple("tmpllexize", Object.class);

    public final StringPath tmplname = createString("tmplname");

    public final NumberPath<Long> tmplnamespace = createNumber("tmplnamespace", Long.class);

    public QPgTsTemplate(String variable) {
        super(QPgTsTemplate.class, forVariable(variable), "pg_catalog", "pg_ts_template");
    }

    @SuppressWarnings("all")
    public QPgTsTemplate(Path<? extends QPgTsTemplate> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_template");
    }

    public QPgTsTemplate(PathMetadata<?> metadata) {
        super(QPgTsTemplate.class, metadata, "pg_catalog", "pg_ts_template");
    }

}

