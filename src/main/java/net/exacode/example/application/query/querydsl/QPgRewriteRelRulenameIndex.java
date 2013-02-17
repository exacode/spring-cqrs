package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgRewriteRelRulenameIndex is a Querydsl query type for QPgRewriteRelRulenameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgRewriteRelRulenameIndex extends com.mysema.query.sql.RelationalPathBase<QPgRewriteRelRulenameIndex> {

    private static final long serialVersionUID = -1350749853;

    public static final QPgRewriteRelRulenameIndex pgRewriteRelRulenameIndex = new QPgRewriteRelRulenameIndex("pg_rewrite_rel_rulename_index");

    public final NumberPath<Long> evClass = createNumber("ev_class", Long.class);

    public final SimplePath<Object> rulename = createSimple("rulename", Object.class);

    public QPgRewriteRelRulenameIndex(String variable) {
        super(QPgRewriteRelRulenameIndex.class, forVariable(variable), "pg_catalog", "pg_rewrite_rel_rulename_index");
    }

    @SuppressWarnings("all")
    public QPgRewriteRelRulenameIndex(Path<? extends QPgRewriteRelRulenameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_rewrite_rel_rulename_index");
    }

    public QPgRewriteRelRulenameIndex(PathMetadata<?> metadata) {
        super(QPgRewriteRelRulenameIndex.class, metadata, "pg_catalog", "pg_rewrite_rel_rulename_index");
    }

}

