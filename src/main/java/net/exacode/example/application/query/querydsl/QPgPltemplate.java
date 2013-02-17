package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgPltemplate is a Querydsl query type for QPgPltemplate
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgPltemplate extends com.mysema.query.sql.RelationalPathBase<QPgPltemplate> {

    private static final long serialVersionUID = 717527057;

    public static final QPgPltemplate pgPltemplate = new QPgPltemplate("pg_pltemplate");

    public final SimplePath<Object[]> tmplacl = createSimple("tmplacl", Object[].class);

    public final BooleanPath tmpldbacreate = createBoolean("tmpldbacreate");

    public final StringPath tmplhandler = createString("tmplhandler");

    public final StringPath tmplinline = createString("tmplinline");

    public final StringPath tmpllibrary = createString("tmpllibrary");

    public final StringPath tmplname = createString("tmplname");

    public final BooleanPath tmpltrusted = createBoolean("tmpltrusted");

    public final StringPath tmplvalidator = createString("tmplvalidator");

    public QPgPltemplate(String variable) {
        super(QPgPltemplate.class, forVariable(variable), "pg_catalog", "pg_pltemplate");
    }

    @SuppressWarnings("all")
    public QPgPltemplate(Path<? extends QPgPltemplate> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_pltemplate");
    }

    public QPgPltemplate(PathMetadata<?> metadata) {
        super(QPgPltemplate.class, metadata, "pg_catalog", "pg_pltemplate");
    }

}

