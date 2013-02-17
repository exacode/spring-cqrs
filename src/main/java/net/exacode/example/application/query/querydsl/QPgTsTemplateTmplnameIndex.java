package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsTemplateTmplnameIndex is a Querydsl query type for QPgTsTemplateTmplnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsTemplateTmplnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsTemplateTmplnameIndex> {

    private static final long serialVersionUID = 1803202846;

    public static final QPgTsTemplateTmplnameIndex pgTsTemplateTmplnameIndex = new QPgTsTemplateTmplnameIndex("pg_ts_template_tmplname_index");

    public final SimplePath<Object> tmplname = createSimple("tmplname", Object.class);

    public final NumberPath<Long> tmplnamespace = createNumber("tmplnamespace", Long.class);

    public QPgTsTemplateTmplnameIndex(String variable) {
        super(QPgTsTemplateTmplnameIndex.class, forVariable(variable), "pg_catalog", "pg_ts_template_tmplname_index");
    }

    @SuppressWarnings("all")
    public QPgTsTemplateTmplnameIndex(Path<? extends QPgTsTemplateTmplnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_template_tmplname_index");
    }

    public QPgTsTemplateTmplnameIndex(PathMetadata<?> metadata) {
        super(QPgTsTemplateTmplnameIndex.class, metadata, "pg_catalog", "pg_ts_template_tmplname_index");
    }

}

